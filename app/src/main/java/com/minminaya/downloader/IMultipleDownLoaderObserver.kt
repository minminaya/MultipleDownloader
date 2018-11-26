package com.minminaya.downloader

interface IMultipleDownLoaderObserver : IDownLoadManagerObserver {
    fun onAllDownLoadComplete(succss: Int, failure: Int)
    fun onAllDownLoadProgress(progress: Int)
}