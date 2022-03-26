/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package fun.learnlife.mqlibrary;
// Declare any non-default types here with import statements

public interface IOnNewTopicArrivedListener extends android.os.IInterface
{
  /** Default implementation for IOnNewTopicArrivedListener. */
  public static class Default implements IOnNewTopicArrivedListener
  {
    @Override public void onClientTopicArrived(String topic, String[] extras) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IOnNewTopicArrivedListener
  {
    private static final String DESCRIPTOR = "fun.learnlife.mqlibrary.IOnNewTopicArrivedListener";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an fun.learnlife.mqlibrary.IOnNewTopicArrivedListener interface,
     * generating a proxy if needed.
     */
    public static IOnNewTopicArrivedListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IOnNewTopicArrivedListener))) {
        return ((IOnNewTopicArrivedListener)iin);
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
        case TRANSACTION_onClientTopicArrived:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          String[] _arg1;
          _arg1 = data.createStringArray();
          this.onClientTopicArrived(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IOnNewTopicArrivedListener
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
      @Override public void onClientTopicArrived(String topic, String[] extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(topic);
          _data.writeStringArray(extras);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onClientTopicArrived, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onClientTopicArrived(topic, extras);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static IOnNewTopicArrivedListener sDefaultImpl;
    }
    static final int TRANSACTION_onClientTopicArrived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(IOnNewTopicArrivedListener impl) {
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
    public static IOnNewTopicArrivedListener getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public void onClientTopicArrived(String topic, String[] extras) throws android.os.RemoteException;
}
