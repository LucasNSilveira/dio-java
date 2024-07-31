package out;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa{

    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemovidas= new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemovidas.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemovidas);
    }

    public int NumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número de elementos na lista é: " + listaTarefa.NumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1 ");
        listaTarefa.adicionarTarefa("Tarefa 1 ");
        listaTarefa.adicionarTarefa("Tarefa 2 ");
        listaTarefa.adicionarTarefa("Tarefa 3 ");
        System.out.println("O número de elementos na lista é: " + listaTarefa.NumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número de elementos na lista é: " + listaTarefa.NumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
        
    }
}