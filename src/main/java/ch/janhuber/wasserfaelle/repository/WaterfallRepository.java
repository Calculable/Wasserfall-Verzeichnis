package ch.janhuber.wasserfaelle.repository;

import ch.janhuber.wasserfaelle.entity.Waterfall;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WaterfallRepository extends JpaSpecificationExecutor<Waterfall>, PagingAndSortingRepository<Waterfall, Long> {


}
