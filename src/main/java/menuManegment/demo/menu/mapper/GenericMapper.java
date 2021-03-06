package menuManegment.demo.menu.mapper;

import menuManegment.demo.menu.entity.Loadable;
import menuManegment.demo.menu.model.ModelLoadable;
import org.mapstruct.factory.Mappers;

public interface GenericMapper<E extends Loadable<?>, M extends ModelLoadable<?>> {

    M entityToModel(E entity);

    E modelToEntity(M model);
}
