package bsky4j.api.entity.bsky.actor;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class ActorSearchActorsTypeaheadResponse {
    private List<ActorDefsProfileView> actors;

    // region
    public List<ActorDefsProfileView> getActors() {
        return actors;
    }

    public void setActors(List<ActorDefsProfileView> actors) {
        this.actors = actors;
    }
    // endregion
}
