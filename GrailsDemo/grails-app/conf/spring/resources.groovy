import com.utopios.factories.HomeFactory

// Place your Spring DSL code here
beans = {
    homeFactory(HomeFactory) {
        firstService = ref("firstService")
    }
}
