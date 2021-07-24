package id.zlz.loginmvvm.responses

data class MasterRole(
    val id: Int,
    val identifiable_field: String,
    val level: Int,
    val role_level: RoleLevel,
    val role_name: String,
    val role_scope: RoleScope
)