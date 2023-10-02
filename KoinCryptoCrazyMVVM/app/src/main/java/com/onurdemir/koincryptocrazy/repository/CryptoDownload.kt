package com.onurdemir.koincryptocrazy.repository

import com.onurdemir.koincryptocrazy.model.CryptoModel
import com.onurdemir.koincryptocrazy.util.Resource

interface CryptoDownload {

    suspend fun downloadCryptos() : Resource<List<CryptoModel>>

}