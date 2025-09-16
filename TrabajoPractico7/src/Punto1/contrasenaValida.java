package Punto1;

public class contrasenaValida {
    private String contrasena;

    public contrasenaValida(String contrasena){
        this.contrasena = contrasena;
    }

    public void validar() throws contrasenaInvalida{

        if (contrasena == null || contrasena.isEmpty()){
        throw new contrasenaInvalida("La contraseña no puede ser nula");
        }

        if (contrasena.length() < 8){
            throw new contrasenaInvalida("La contraseña debe contener al menos 8 caracteres");
        }

        boolean tieneNumero = false;
        for (char c : contrasena.toCharArray()){
            if (Character.isDigit(c)){
                tieneNumero = true;
                break;
            }
        }
        if (!tieneNumero){
            throw new contrasenaInvalida("La contraseña debe contener al menos un numero ");
        }

        System.out.println("Contraseña valida");
    }
}
