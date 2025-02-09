fun main() {
    val tasks = mutableListOf<String>()

    while (true) {
        println("\nGerenciador de Tarefas")
        println("1. Adicionar tarefa")
        println("2. Listar tarefas")
        println("3. Remover tarefa")
        println("4. Sair")
        print("Escolha uma opção: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Digite a nova tarefa: ")
                val task = readLine()
                if (!task.isNullOrBlank()) {
                    tasks.add(task)
                    println("Tarefa adicionada!")
                } else {
                    println("Tarefa inválida!")
                }
            }
            2 -> {
                if (tasks.isEmpty()) {
                    println("Nenhuma tarefa disponível.")
                } else {
                    println("\nLista de Tarefas:")
                    tasks.forEachIndexed { index, task -> println("${index + 1}. $task") }
                }
            }
            3 -> {
                print("Digite o número da tarefa para remover: ")
                val index = readLine()?.toIntOrNull()
                if (index != null && index in 1..tasks.size) {
                    tasks.removeAt(index - 1)
                    println("Tarefa removida!")
                } else {
                    println("Número inválido!")
                }
            }
            4 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida!")
        }
    }
}
