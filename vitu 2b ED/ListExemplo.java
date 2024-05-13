import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListExemplo{


    public static void main(String[] args){

        List<String> nomeAlunoList = new ArrayList();

        nomeAlunoList.add("João");
        nomeAlunoList.add("Carlos");
        nomeAlunoList.add("Jeff");
        nomeAlunoList.add("Kara");
        nomeAlunoList.add("Mary");
        nomeAlunoList.add("Jenny");
        Collections.sort(nomeAlunoList);

        System.out.println("Essa é sua lista" + nomeAlunoList);
        System.out.println("Abaixo estão os elementos pegos na posição");
        System.out.println(nomeAlunoList.get(4));
        System.out.println(nomeAlunoList.remove(1));
        System.out.println("O tamanho da lista é: " + nomeAlunoList.size());
        System.out.println("A lista está assim agora" + nomeAlunoList);
    }
}
