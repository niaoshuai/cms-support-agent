package ren.shuaipeng.cms.support.agent

import org.springframework.asm.ClassReader
import org.springframework.cglib.core.ClassNameReader
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
            var classReader = ClassReader(className)
            var classNameReader = ClassNameReader.getClassName(classReader)
            println("classNameReader = ${classNameReader}")

        }
        return null
    }
}