package reciclarte.com.br.reciclarte.data

import reciclarte.com.br.reciclarte.domain.*

class AllEmpresasDataBase {

    companion object{

        fun getItems()
            = listOf(
                Empresas(
                    "Empresa Rio Verde Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Adidas",
                        "https://cdn.awsli.com.br/400x300/1062/1062636/logo/1a09cccb3a.png"
                    ),
                    Price(
                        119.90F,
                        10,
                        false,
                        0F
                    ),
                    Rate(
                        3.5F,
                        193
                    )
                ),
                Empresas(
                    "Empresa Rio Azul Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Oakley",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Oakley_logo.svg/641px-Oakley_logo.svg.png"
                    ),
                    Price(
                        149.99F,
                        2,
                        true,
                        84.99F
                    ),
                    Rate(
                        4.5F,
                        37
                    )
                ),
                Empresas(
                    "Empresa Rio Laranja Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Nike",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Logo_NIKE.svg/1200px-Logo_NIKE.svg.png"
                    ),
                    Price(
                        349.99F,
                        5,
                        true,
                        229.99F
                    ),
                    Rate(
                        4.5F,
                        6
                    )
                ),
                Empresas(
                    "Empresa Rio Rosa Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Olympikus",
                        "https://logodownload.org/wp-content/uploads/2017/06/olympikus-logo.png"
                    ),
                    Price(
                        159.99F,
                        3,
                        true,
                        119.99F
                    ),
                    Rate(
                        4.5F,
                        339
                    )
                ),
                Empresas(
                    "Empresa Rio Lilás Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Adidas",
                        "https://9d41bboy87-flywheel.netdna-ssl.com/outlets-at-legends/wp-content/uploads/sites/11/2019/07/Adidas_Logo.png"
                    ),
                    Price(
                        699.99F,
                        10,
                        true,
                        439.99F
                    ),
                    Rate(
                        4.5F,
                        820
                    )
                ),
                Empresas(
                    "Empresa Rio Amarelo Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Nike",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Logo_NIKE.svg/1200px-Logo_NIKE.svg.png"
                    ),
                    Price(
                        229.99F,
                        4,
                        true,
                        169.99F
                    ),
                    Rate(
                        5F,
                        889
                    )
                ),
                Empresas(
                    "Empresa Rio Cinza Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Reebok",
                        "https://seeklogo.com/images/R/reebok-logo-B8CC638372-seeklogo.com.png"
                    ),
                    Price(
                        599.99F,
                        10,
                        false,
                        0F
                    ),
                    Rate(
                        4.5F,
                        13
                    )
                ),
                Empresas(
                    "Empresa Rio Preto Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893696341832761374/kisspng-recycling-symbol-reuse-waste-minimisation-energy-and-environmental-protection-5a92ced8e34617.png",
                    Brand(
                        "Nike",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Logo_NIKE.svg/1200px-Logo_NIKE.svg.png"
                    ),
                    Price(
                        449.99F,
                        10,
                        false,
                        0F
                    ),
                    Rate(
                        5F,
                        6
                    )
                )
            )
    }
}