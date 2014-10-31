package co.edu.udea.compumovil.gr7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BuscarActivity extends Activity {

	/*
	 * @Override protected void onCreate(Bundle savedInstanceState) {
	 * super.onCreate(savedInstanceState);
	 * setContentView(R.layout.activity_buscar); Spinner spinner = (Spinner)
	 * findViewById(R.id.spinnerDepartamento); ArrayAdapter<CharSequence>
	 * adapter = ArrayAdapter.createFromResource(this, R.array.departamentos,
	 * android.R.layout.simple_spinner_dropdown_item);
	 * adapter.setDropDownViewResource
	 * (android.R.layout.simple_spinner_dropdown_item);
	 * spinner.setAdapter(adapter); }
	 */
	// private Spinner spDepartamentos, spMunicipios;
	Spinner spMunicipios;

	ArrayAdapter<CharSequence> aa_amazonas;
	ArrayAdapter<CharSequence> aa_antioquia;
	ArrayAdapter<CharSequence> aa_arauca;
	ArrayAdapter<CharSequence> aa_atlantico;
	ArrayAdapter<CharSequence> aa_bolivar;
	ArrayAdapter<CharSequence> aa_boyaca;
	ArrayAdapter<CharSequence> aa_caldas;
	ArrayAdapter<CharSequence> aa_caqueta;
	ArrayAdapter<CharSequence> aa_casanare;
	ArrayAdapter<CharSequence> aa_default;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);

		Spinner spDepartamentos = (Spinner) findViewById(R.id.spinnerDepartamento);
		spDepartamentos.setOnItemSelectedListener(new SpinnerListener());

		Spinner spinnerCarreras = (Spinner) findViewById(R.id.spinnerCarrera);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.carreras,
				android.R.layout.simple_spinner_dropdown_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerCarreras.setAdapter(adapter);

	}

	public class SpinnerListener implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int pos,
				long id) {
			// TODO Auto-generated method stub
			cargaSpinnerMunicipio(parent.getSelectedItemPosition());

		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}

		private void cargaSpinnerMunicipio(int departamento) {
			spMunicipios = (Spinner) findViewById(R.id.spinnerMunicipio);
			aa_amazonas = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_amazonas,
					android.R.layout.simple_spinner_item);
			aa_antioquia = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_antioquia,
					android.R.layout.simple_spinner_item);
			aa_arauca = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_arauca,
					android.R.layout.simple_spinner_item);
			aa_atlantico = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_atlantico,
					android.R.layout.simple_spinner_item);
			aa_bolivar = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_bolivar,
					android.R.layout.simple_spinner_item);
			aa_boyaca = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_boyaca,
					android.R.layout.simple_spinner_item);
			aa_caldas = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_caldas,
					android.R.layout.simple_spinner_item);
			aa_caqueta = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_caqueta,
					android.R.layout.simple_spinner_item);
			aa_casanare = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.municipios_casanare,
					android.R.layout.simple_spinner_item);
			aa_default = ArrayAdapter.createFromResource(BuscarActivity.this,
					R.array.arrayDefecto, android.R.layout.simple_spinner_item);

			switch (departamento) {
			case 1:
				spMunicipios.setAdapter(aa_amazonas);
				break;
			case 2:
				spMunicipios.setAdapter(aa_antioquia);
				break;
			case 3:
				spMunicipios.setAdapter(aa_arauca);
				break;
			case 4:
				spMunicipios.setAdapter(aa_atlantico);
				break;
			case 5:
				spMunicipios.setAdapter(aa_bolivar);
				break;
			case 6:
				spMunicipios.setAdapter(aa_boyaca);
				break;
			case 7:
				spMunicipios.setAdapter(aa_caldas);
				break;
			case 8:
				spMunicipios.setAdapter(aa_caqueta);
				break;
			case 9:
				spMunicipios.setAdapter(aa_casanare);
				break;
			default:
				spMunicipios.setAdapter(aa_default);
				break;
			}
		}
	}

	/*
	 * @Override protected void onCreate(Bundle savedInstanceState) {
	 * super.onCreate(savedInstanceState);
	 * setContentView(R.layout.activity_main);
	 * 
	 * this.spDepartamentos = (Spinner) findViewById(R.id.spinnerDepartamento);
	 * this.spMunicipios = (Spinner) findViewById(R.id.spinnerMunicipio);
	 * 
	 * loadSpinnerDepartamentos();
	 * 
	 * }
	 */

}
