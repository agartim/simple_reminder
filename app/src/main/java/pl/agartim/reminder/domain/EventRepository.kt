package pl.agartim.reminder.domain

import pl.agartim.reminder.domain.model.Event

/**
 * Created by artur on 03.05.18.
 */
interface EventRepository {
    fun addNewEvent(event: Event)
    fun updateEvent(event: Event)
    fun getEventById(eventId: Long): Event
    fun getEventsByStatus(status: Int): List<Event>


}