package com.example.viewmodelproject

class CustomerProvider {
    companion object {
        private val pictures: List<String> = listOf(
            "https://cdn.discordapp.com/attachments/875036375454461992/1074408796446785546/Group_56.png",
        )

        val customers = listOf<Customer>(
            Customer("Edgar Salas", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Isaaias Martinez", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Nuria Martinez", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Rafael de Pina", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Marcelo Zair", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Sebastian Contreras", "+52 449 123 1712", "Provider", "001120312", pictures[0]),
            Customer("Hugo Lopez", "+01 421123 1712", "Provider", "001120312", pictures[0]),
            Customer("Eduardo Lima", "+51 449 123 1712", "Provider", "001120312", pictures[0])
        );
    }
}