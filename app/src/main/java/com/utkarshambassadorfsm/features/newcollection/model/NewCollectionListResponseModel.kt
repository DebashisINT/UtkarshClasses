package com.utkarshambassadorfsm.features.newcollection.model

import com.utkarshambassadorfsm.app.domain.CollectionDetailsEntity
import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}