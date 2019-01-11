package com.minminaya.downloader

interface IDownloadEntity {
    fun getUniqueKey()

    fun setDownloadProgress(progress: Int)

    fun getDownloadProgress(): Int
}