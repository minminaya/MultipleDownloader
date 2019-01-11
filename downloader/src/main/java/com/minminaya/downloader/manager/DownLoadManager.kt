package com.minminaya.downloader.manager

import com.minminaya.downloader.IDownloadEntity
import com.minminaya.downloader.observer.IMultipleDownLoaderObserver

class DownLoadManager : IMultipleDownLoaderObserver {
    override fun onAllDownLoadComplete(succss: Int, failure: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAllDownLoadProgress(progress: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadWait(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadStart(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadCancel(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadFail(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadSuccess(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDownLoadProgress(material: IDownloadEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}