plugins {
  id("com.google.cloud.tools.jib") version "3.4.0"
}

jib {
    from {
        image = "cgr.dev/chainguard/jre@sha256:095441b842934533f57d1ef1ce6042642c0545aa06968af708b9a0e0f426c2ce"
    }
}