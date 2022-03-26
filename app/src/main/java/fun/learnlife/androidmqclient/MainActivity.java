package fun.learnlife.androidmqclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.Arrays;

import androidx.appcompat.app.AppCompatActivity;
import fun.learnlife.mqlibrary.IOnNewTopicArrivedListener;
import fun.learnlife.mqlibrary.ITopicManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mq-client";
    private static ITopicManager iTopicManager;
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            ITopicManager topicManager = ITopicManager.Stub.asInterface(service);
            iTopicManager = topicManager;
            try {
                iTopicManager.registerClientListener(new String[]{Protocol.wake, Protocol.session_end}, new IOnNewTopicArrivedListener.Stub() {

                    @Override
                    public void onClientTopicArrived(String topic, String[] extras) throws RemoteException {
                        Log.i(TAG, "onClientTopicArrived,topic = " + topic + ", extras = " + Arrays.toString(extras));
                    }
                });
                iTopicManager.publishToVoice(Protocol.wake, new String[]{"mock a wake up from client...", "from client message"});
                Log.i(TAG, "onServiceConnected");
            } catch (RemoteException e) {
                Log.i(TAG, "msg = " + e.getMessage());
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.i(TAG, "onServiceDisconnected");
            iTopicManager = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setClassName("fun.learnlife.androidmq", "fun.learnlife.mqlibrary.aidl.MqService");
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }
}