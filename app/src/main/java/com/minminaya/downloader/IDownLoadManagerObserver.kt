package com.minminaya.downloader

interface IDownLoadManagerObserver {
    fun onDownLoadWait(material: IDownloadEntity)
    fun onDownLoadStart(material: IDownloadEntity)
    fun onDownLoadCancel(material: IDownloadEntity)
    fun onDownLoadFail(material: IDownloadEntity)
    fun onDownLoadSuccess(material: IDownloadEntity)
    fun onDownLoadProgress(material: IDownloadEntity)
}