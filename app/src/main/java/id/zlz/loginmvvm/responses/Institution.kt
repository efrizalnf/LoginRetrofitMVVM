package id.zlz.loginmvvm.responses

data class Institution(
    val category_id: Int,
    val city_id: String,
    val id: Int,
    val laravel_through_key: Int,
    val name: String,
    val province_id: String
)