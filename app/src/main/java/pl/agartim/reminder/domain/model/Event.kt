package pl.agartim.reminder.domain.model

import java.util.*

/**
 * Created by artur on 03.05.18.
 */
data class Event(val id: Long,
                 val type: EVENT_TYPE,
                 val reminderDate: Date,
                 var status: EVENT_STATUS,
                 var phoneNumber: String,
                 var phoneNumberName: String,
                 var note: String)