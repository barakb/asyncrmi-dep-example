package com.github.barakb;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.concurrent.CompletableFuture;

/**
 * Created by Barak Bar Orion
 * on 9/5/15.
 *
 */
public interface Example extends Remote {
    String echo(String msg) throws RemoteException;
    CompletableFuture<String> futuredEcho(String msg) throws RemoteException;
}
