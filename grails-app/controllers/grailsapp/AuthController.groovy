package grailsapp

class AuthController {

    AuthService authService
    UsuarioService usuarioService

    def login() {
    }

    def doLogin() {
        if (authService.doLogin(params.email, params.password)) {
            redirect(controller: "dashboard", action: "index")
        } else {
            redirect(controller: "auth", action: "login")
        }
    }


    def logout() {
        session.invalidate()
        redirect(controller: "auth", action: "login")
    }





}
