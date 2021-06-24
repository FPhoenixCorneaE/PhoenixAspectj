package com.fphoenixcorneae.aspectj.demo

import com.fphoenixcorneae.annotation.AndroidAspectj

@AndroidAspectj
@Target(AnnotationTarget.FUNCTION)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class MustLogin