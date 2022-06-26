package pr.idat.proyectoin.Service;

import java.util.Collection;

import pr.idat.proyectoin.Entity.TipoModeloMontura;

public interface TipoModeloMonturaService {

	public abstract void Insert(TipoModeloMontura tipoModeloMontura);

	public abstract void Update(TipoModeloMontura tipoMondeloMontura);

	public abstract void Delete(Integer ID);

	public abstract TipoModeloMontura FindByID(Integer ID);

	public abstract Collection<TipoModeloMontura> FindAll();
}
