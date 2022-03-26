/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package fun.learnlife.mqlibrary;
public interface ITopicManager extends android.os.IInterface
{
  /** Default implementation for ITopicManager. */
  public static class Default implements ITopicManager
  {
    @Override public void publishToClient(String topic, String[] extras) throws android.os.RemoteException
    {
    }
    @Override public void publishToVoice(String topic, String[] extras) throws android.os.RemoteException
    {
    }
    @Override public void registerClientListener(String[] topics, IOnNewTopicArrivedListener listener) throws android.os.RemoteException
    {
    }
    // 注册voice发布到client接口

    @Override public void addClientNeedTopicListener(IAddTopic l) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements ITopicManager
  {
    private static final String DESCRIPTOR = "fun.learnlife.mqlibrary.ITopicManager";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an fun.learnlife.mqlibrary.ITopicManager interface,
     * generating a proxy if needed.
     */
    public static ITopicManager asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof ITopicManager))) {
        return ((ITopicManager)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_publishToClient:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          String[] _arg1;
          _arg1 = data.createStringArray();
          this.publishToClient(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_publishToVoice:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          String[] _arg1;
          _arg1 = data.createStringArray();
          this.publishToVoice(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_registerClientListener:
        {
          data.enforceInterface(descriptor);
          String[] _arg0;
          _arg0 = data.createStringArray();
          IOnNewTopicArrivedListener _arg1;
          _arg1 = IOnNewTopicArrivedListener.Stub.asInterface(data.readStrongBinder());
          this.registerClientListener(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addClientNeedTopicListener:
        {
          data.enforceInterface(descriptor);
          IAddTopic _arg0;
          _arg0 = IAddTopic.Stub.asInterface(data.readStrongBinder());
          this.addClientNeedTopicListener(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements ITopicManager
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void publishToClient(String topic, String[] extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(topic);
          _data.writeStringArray(extras);
          boolean _status = mRemote.transact(Stub.TRANSACTION_publishToClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().publishToClient(topic, extras);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void publishToVoice(String topic, String[] extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(topic);
          _data.writeStringArray(extras);
          boolean _status = mRemote.transact(Stub.TRANSACTION_publishToVoice, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().publishToVoice(topic, extras);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void registerClientListener(String[] topics, IOnNewTopicArrivedListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(topics);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerClientListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerClientListener(topics, listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // 注册voice发布到client接口

      @Override public void addClientNeedTopicListener(IAddTopic l) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((l!=null))?(l.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_addClientNeedTopicListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addClientNeedTopicListener(l);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static ITopicManager sDefaultImpl;
    }
    static final int TRANSACTION_publishToClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_publishToVoice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_registerClientListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_addClientNeedTopicListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(ITopicManager impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static ITopicManager getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public void publishToClient(String topic, String[] extras) throws android.os.RemoteException;
  public void publishToVoice(String topic, String[] extras) throws android.os.RemoteException;
  public void registerClientListener(String[] topics, IOnNewTopicArrivedListener listener) throws android.os.RemoteException;
  // 注册voice发布到client接口

  public void addClientNeedTopicListener(IAddTopic l) throws android.os.RemoteException;
}
