package pl.agartim.reminder.interactor

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import pl.agartim.reminder.domain.EventRepository
import pl.agartim.reminder.domain.model.EVENT_STATUS
import pl.agartim.reminder.domain.model.EVENT_TYPE
import pl.agartim.reminder.domain.model.Event
import java.util.*

/**
 * Created by artur on 03.05.18.
 */
class GetEventUseCaseTest {

    lateinit var getEventUseCase: GetEventUseCase
    lateinit var eventRepository: EventRepository

    @Before
    fun setUp() {
        eventRepository = Mockito.mock(EventRepository::class.java)
        getEventUseCase = GetEventUseCase(eventRepository)
    }

    @Test
    fun shouldGetNoteById() {
        val eventId = 1L
        val event = Event(eventId, EVENT_TYPE.NOTE, Date(), EVENT_STATUS.NEW, "", "", "")

        Mockito.`when`(eventRepository.getEventById(eventId)).thenReturn(event)

        assertEquals(event, getEventUseCase.execute(eventId))


    }

}