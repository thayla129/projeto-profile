package br.senai.sp.jandira.thaylaprojetoprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

        // Topo roxo com avatar e nome
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(Color(0xFF5E17EB)),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(20.dp))
                Text("Details", color = Color.White, fontSize = 18.sp)

                Spacer(modifier = Modifier.height(12.dp))
                Image(
                    painter = painterResource(id = R.drawable.profile_avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Jenny Wilson",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text("Sr.UI/UX Designer", color = Color.White.copy(alpha = 0.8f), fontSize = 14.sp)

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    ProfileAction(icon = Icons.Default.Email, label = "Email")
                    ProfileAction(icon = Icons.Default.Call, label = "Call")
                    ProfileAction(icon = Icons.Default.Notifications, label = "Whatsapp")
                    ProfileAction(icon = Icons.Default.Star, label = "Favorite")
                }
            }
        }

        // Informações (ajustadas para corresponder à imagem)
        Column(modifier = Modifier.padding(24.dp)) {
            // Email section
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email",
                    tint = Color(0xFF5E17EB), // Cor roxa
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = "Email", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Official", fontSize = 14.sp, color = Color.Gray)
                    Text("michael.mitc@example.com", fontSize = 14.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Personal", fontSize = 14.sp, color = Color.Gray)
                    Text("michael@example.com", fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Phone number section
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = "Phone",
                    tint = Color(0xFF5E17EB), // Cor roxa
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = "Phone number", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Mobile", fontSize = 14.sp, color = Color.Gray)
                    Text("(209) 555-0104", fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Team section (sem ícone)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(text = "Team", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text("Project Operation Team", fontSize = 14.sp)
                }
                Icon(
                    Icons.Default.ArrowForward,
                    contentDescription = null,
                    tint = Color(0xFF5E17EB) // Cor roxa
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Leads by section
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "Leads by",
                        tint = Color(0xFF5E17EB), // Cor roxa
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(text = "Leads by", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text("Darrell Steward", fontSize = 14.sp)
                    }
                }
                Icon(
                    Icons.Default.ArrowForward,
                    contentDescription = null,
                    tint = Color(0xFF5E17EB) // Cor roxa
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botão inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E17EB)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Add to contact", color = Color.White)
            }
        }
    }
}

@Composable
fun ProfileAction(icon: ImageVector, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(width = 64.dp, height = 60.dp)
                .border(
                    width = 1.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = label, color = Color.White, fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}