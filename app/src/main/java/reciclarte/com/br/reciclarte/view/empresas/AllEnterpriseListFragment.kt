package reciclarte.com.br.reciclarte.view.empresas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_all_empresas_list.*
import reciclarte.com.br.reciclarte.R
import reciclarte.com.br.reciclarte.data.AllEmpresasDataBase
import reciclarte.com.br.reciclarte.view.MainActivity


class AllEnterpriseListFragment : Fragment() {

    companion object{
        const val GRID_COLUMNS = 2
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

        return inflater
            .inflate(
                R.layout.fragment_all_empresas_list,
                container,
                false
            )
    }

    override fun onActivityCreated( savedInstanceState: Bundle? ) {
        super.onActivityCreated( savedInstanceState )

        initItems()
    }

    private fun initItems(){
        rv_empresas.setHasFixedSize( false )

        val layoutManager = GridLayoutManager(
            activity,
            GRID_COLUMNS,
            RecyclerView.VERTICAL,
            false
        )
        rv_empresas.layoutManager = layoutManager

        val adapter = AllEmpresasListAdapter( AllEmpresasDataBase.getItems() )
        rv_empresas.adapter = adapter
    }

    override fun onResume() {
        super.onResume()

        (activity as MainActivity)
            .updateToolbarTitleInFragment( R.string.all_shoes_list_frag_title )
    }
}
