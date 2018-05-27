package com.msl.ignite.promo.loader;

import com.msl.ignite.promo.entity.Promocion;
import com.msl.ignite.promo.entity.Promocionable;

public interface IPromocionableRepositoryLoader {
	public void loadPromociones();
	public void deletePromociones();
	public void loadPromociones(Iterable<Promocionable> promocionables);
	public void save(Promocionable promocionable, Promocion promocion);
}
