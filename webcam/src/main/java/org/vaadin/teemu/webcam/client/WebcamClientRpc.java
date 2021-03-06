package org.vaadin.teemu.webcam.client;

import com.vaadin.shared.communication.ClientRpc;

public interface WebcamClientRpc extends ClientRpc {

    /**
     * Passes the command to capture image from server to the client.
     */
    public void capture();

}