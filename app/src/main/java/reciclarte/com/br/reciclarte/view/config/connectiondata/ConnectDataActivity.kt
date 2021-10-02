package reciclarte.com.br.reciclarte.view.config.connectiondata

import reciclarte.com.br.reciclarte.view.config.ConfigFormActivity
import reciclarte.com.br.reciclarte.view.config.ConfigSectionsAdapter

class ConnectDataActivity :
    ConfigFormActivity() {

    override fun getSectionsAdapter()
        = ConfigSectionsAdapter(
            this,
            supportFragmentManager,
            FormEmailFragment(),
            FormPasswordFragment()
        )
}