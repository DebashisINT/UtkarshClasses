package com.utkarshambassadorfsmnew.features.nearbyuserlist.api

import com.utkarshambassadorfsmnew.app.Pref
import com.utkarshambassadorfsmnew.features.nearbyuserlist.model.NearbyUserResponseModel
import com.utkarshambassadorfsmnew.features.newcollection.model.NewCollectionListResponseModel
import com.utkarshambassadorfsmnew.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}