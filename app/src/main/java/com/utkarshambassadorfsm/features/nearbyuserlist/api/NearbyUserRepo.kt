package com.utkarshambassadorfsm.features.nearbyuserlist.api

import com.utkarshambassadorfsm.app.Pref
import com.utkarshambassadorfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.utkarshambassadorfsm.features.newcollection.model.NewCollectionListResponseModel
import com.utkarshambassadorfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}