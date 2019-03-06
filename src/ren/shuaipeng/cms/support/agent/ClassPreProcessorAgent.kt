package ren.shuaipeng.cms.support.agent

import java.lang.instrument.ClassFileTransformer
import java.security.ProtectionDomain

class ClassPreProcessorAgent : ClassFileTransformer {
    override fun transform(
        loader: ClassLoader?,
        className: String?,
        classBeingRedefined: Class<*>?,
        protectionDomain: ProtectionDomain?,
        classfileBuffer: ByteArray?
    ): ByteArray? {
        if (className!!.startsWith("ren/shuaipeng/cms")) {
            println("className = ${className}")
            // TODO 监控URL(Handler)的调用情况
        }
        return null
    }
}