package org.ieslosremedios.daw1.prog.herencia;

public class Personal extends Persona{
    private String departamento;
    private Integer salario;

    public Personal(){ //Metodo constructor por defecto sin parametros

    }
    public Personal(String nombre, String apellido, Integer edad, String nif, Integer nss, String departamento, Integer salario){ //metodo constructor
        super();//
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDatosPersonal() {
        System.out.println("Departamento de trabajo: "+departamento);
        System.out.println("Salario: "+salario);
    }

    public void Experto(){
        if (salario>=3000){
            System.out.println("Es un experto");
        }else{
            System.out.println("Es todavia nuevo en su campo");
        }
    }
    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
