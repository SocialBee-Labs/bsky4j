package bsky4j.model.bsky.actor;

import javax.annotation.Nullable;

/**
 * A reference to an actor in the network.
 */
public class ActorDefsProfileViewBasic {

    private String did;
    private String handle;
    @Nullable
    private String displayName;
    @Nullable
    private String avatar;
    @Nullable
    private ActorDefsViewerState viewer;

    // region
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@Nullable String displayName) {
        this.displayName = displayName;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public ActorDefsViewerState getViewer() {
        return viewer;
    }

    public void setViewer(@Nullable ActorDefsViewerState viewer) {
        this.viewer = viewer;
    }
    // endregion
}