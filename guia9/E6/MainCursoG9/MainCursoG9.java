package guia9.E6.MainCursoG9;

import guia9.E6.CursoG9.CursoG9;
import guia9.E6.ServicioCursoG9.ServicioCursoG9;

public class MainCursoG9 {

    public static void main(String[] args) {
        
        ServicioCursoG9 C1 = new ServicioCursoG9();
        
        CursoG9 C = C1.crearCurso();
        System.out.println(C.toString());
        C1.calcularGananciaSemanal(C);
        
    }
    
}
