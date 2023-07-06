import br.com.allan.dominio.Bootcamp;
import br.com.allan.dominio.Curso;
import br.com.allan.dominio.Dev;
import br.com.allan.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso de Java", "Descrição do curso de Java", 40);
        Curso curso2 = new Curso("Curso de Angular", "Descrição do curso de Angular", 40);

        Mentoria mentoria = new Mentoria("Mentoria de JavaScript", "Descrição da mentoria de JavaScript");

        Bootcamp bootcamp = new Bootcamp("Bootcamp JavaDeveloper", "Descrição do Bootcamp JavaDeveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Número de conteúdos concluídos: " + dev1.getConteudosConcluidos().size());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-------------------------------------------------------");

        Dev dev2 = new Dev("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("Número de conteúdos concluídos: " + dev2.getConteudosConcluidos().size());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}