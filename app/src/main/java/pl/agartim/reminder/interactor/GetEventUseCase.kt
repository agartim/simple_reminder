package pl.agartim.reminder.interactor

import pl.agartim.reminder.domain.EventRepository
import pl.agartim.reminder.domain.model.Event
import pl.agartim.reminder.interactor.type.UseCaseWithParams

/**
 * Created by artur on 03.05.18.
 */
class GetEventUseCase(private val eventRepository: EventRepository)
    : UseCaseWithParams<Long, Event> {
    override fun execute(parameter: Long): Event {
        return eventRepository.getEventById(parameter)
    }
}