package com.areaseys.pdfscanner.pdfscanner

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class PdfscannerPlugin : MethodCallHandler {

    companion object {
        @JvmStatic
        fun registerWith(registrar: Registrar) {
            val channel = MethodChannel(registrar.messenger(), "pdfscanner")
            channel.setMethodCallHandler(PdfscannerPlugin())
        }
    }

    override fun onMethodCall(call: MethodCall, result: Result) {
        when (call.method) {
            "scan" -> scan(result)
            else -> result.notImplemented()
        }
    }


    private fun scan(result: Result) {
        result.success("Not implemented!")
    }
}