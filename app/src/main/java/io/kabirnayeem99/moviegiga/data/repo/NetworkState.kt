package io.kabirnayeem99.moviegiga.data.repo

enum class NetworkStatus {
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState(val networkStatus: NetworkStatus, val msg: String) {
    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val FAILED: NetworkState

        init {
            LOADED = NetworkState(NetworkStatus.SUCCESS, "Success")
            LOADING = NetworkState(NetworkStatus.RUNNING, "Loading")
            FAILED = NetworkState(NetworkStatus.FAILED, "Failed")
        }
    }
}