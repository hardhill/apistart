package hh.clipdb.api.service

import org.springframework.beans.factory.annotation.Autowired

class ActivityService {

    private var activityRepository:IActivityRepository

    @Autowired
    constructor(activityRepository: IActivityRepository) {
        this.activityRepository = activityRepository
    }

    fun getById(id:Long):Activity{
        return activityRepository.getById(id)
    }

    fun getByCategory(category_id: Long):List<Activity>{
        return activityRepository.findActivitiesByCategory_IdOrderByCreatedAtAsc(category_id)
    }
    fun add(activity: Activity):Activity{
        return activityRepository.save(activity)
    }
}