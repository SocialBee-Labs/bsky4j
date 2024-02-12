package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.actor.*;
import bsky4j.api.entity.share.Response;

public interface ActorResource {

    /**
     * Find actors matching search criteria.
     */
    Response<ActorSearchActorsResponse> searchActors(ActorSearchActorsRequest request);

    /**
     * Find actors suggestions for a prefix search term.
     */
    Response<ActorSearchActorsTypeaheadResponse> searchActorsTypeahead(ActorSearchActorsTypeaheadRequest request);

    /**
     *
     */
    Response<ActorGetProfileResponse> getProfile(ActorGetProfileRequest request);

    /**
     *
     */
    Response<ActorGetProfilesResponse> getProfiles(ActorGetProfilesRequest request);

    /**
     * Get private preferences attached to the account.
     */
    Response<ActorGetPreferencesResponse> getPreferences(ActorGetPreferencesRequest request);

}
