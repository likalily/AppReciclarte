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
                        "Cod.1",
                        "1"
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
                    "Empresa Vidro Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922857531355246/recy1.png",
                    Brand(
                        "Cod.2",
                        "2"
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
                    "Empresa MultRecy Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922862270910515/recy2.png",
                    Brand(
                        "Cod.3",
                        "3"
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
                    "Empresa Reciclagem Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922866968535060/recy3.png",
                    Brand(
                        "Cod.4",
                        "4"
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
                    "Empresa BioRecicle Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922871318028288/recy4.png",
                    Brand(
                        "Cod.5",
                        "5"
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
                    "Empresa RecycleOrganic Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922875642347550/recy5.png",
                    Brand(
                        "Cod.6",
                        "6"
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
                    "Empresa RecyEletron Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922881673785384/recy6.png",
                    Brand(
                        "Cod.7",
                        "7"
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
                    "Empresa RecyLamp Ferraz",
                    "https://media.discordapp.net/attachments/879228491202170933/893922888195899463/recy7.png",
                    Brand(
                        "Cod.8",
                        "8"
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