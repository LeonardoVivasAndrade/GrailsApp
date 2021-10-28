package grailsapp


class AuthService {

    def login() {
    }

    def doLogin(String email, String contrasena){
        Usuario usuario = Usuario.findByCorreoAndContrasena(email, contrasena)
        if (usuario){
            return true
        }
        return false
    }

}
