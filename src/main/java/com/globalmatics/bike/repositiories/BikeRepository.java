package com.globalmatics.bike.repositiories;

import com.globalmatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by genil on 6/2/18 at 15 54
 **/

public interface BikeRepository extends JpaRepository<Bike,Long> {
}
