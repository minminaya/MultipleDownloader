package com.minminaya.downloader.observer

import com.minminaya.downloader.IDownloadEntity

interface IDownLoadManagerObserver {
    fun onDownLoadWait(material: IDownloadEntity)
    fun onDownLoadStart(material: IDownloadEntity)
    fun onDownLoadCancel(material: IDownloadEntity)
    fun onDownLoadFail(material: IDownloadEntity)
    fun onDownLoadSuccess(material: IDownloadEntity)
    fun onDownLoadProgress(material: IDownloadEntity)
}