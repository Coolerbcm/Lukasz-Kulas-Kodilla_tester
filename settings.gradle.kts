rootProject.name = "kodilla-course"
include("kodilla-intro")
include("kodilla-intro:src:main:udemy")
findProject(":kodilla-intro:src:main:udemy")?.name = "udemy"
include("kodilla-basic-tests")
include("kodilla-collections")
include("kodilla-collections-advanced")
include("Udemy")
include("kodilla-stream")
include("kodilla-advanced-tests")
include("kodilla-spring-basic")
