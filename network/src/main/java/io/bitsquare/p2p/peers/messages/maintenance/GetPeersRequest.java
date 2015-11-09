package io.bitsquare.p2p.peers.messages.maintenance;

import io.bitsquare.app.Version;
import io.bitsquare.p2p.Address;

import java.util.HashSet;

public final class GetPeersRequest extends MaintenanceMessage {
    // That object is sent over the wire, so we need to take care of version compatibility.
    private static final long serialVersionUID = Version.NETWORK_PROTOCOL_VERSION;

    public final Address address;
    public final HashSet<Address> peerAddresses;

    public GetPeersRequest(Address address, HashSet<Address> peerAddresses) {
        this.address = address;
        this.peerAddresses = peerAddresses;
    }

    @Override
    public String toString() {
        return "GetPeersRequest{" +
                "address=" + address +
                ", peerAddresses=" + peerAddresses +
                '}';
    }
}