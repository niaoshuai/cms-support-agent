package ren.shuaipeng.cms.support.agent

import java.lang.instrument.ClassFileTransformer
import java.lang.instrument.Instrumentation


class CmsSupportAgent {


    companion object {

        @JvmStatic
        private var transformer : ClassFileTransformer = ClassPreProcessorAgent()

        @JvmStatic
        private var instrumentation: Instrumentation? = null

        @JvmStatic
        fun premain(options: String?, inst: Instrumentation) {
            if (instrumentation != null) {
                return
            }
            instrumentation = inst
            instrumentation!!.addTransformer(transformer)
        }

        @JvmStatic
        fun agentmain(options: String, inst: Instrumentation) {
            if (instrumentation != null) {
                return
            }
            instrumentation = inst
            instrumentation!!.addTransformer(transformer)
        }

    }
}