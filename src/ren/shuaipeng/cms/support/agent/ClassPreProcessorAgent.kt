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
        return null
    }
}